package biz.controller;

import java.util.Date;


import biz.dao.mappers.*;
import biz.dao.mappers.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TblockcolumnsMapper tblockcolumnsMapper;
    @Autowired
    private TblockcontrolsMapper tblockcontrolsMapper;
    @Autowired
    private TinstinterinputconfigMapper tinstinterinputconfigMapper;
    @Autowired
    private TquerycolumnMapper tquerycolumnMapper;
    @Autowired
    private TbapiqueryconfigMapper tbapiqueryconfigMapper;
    @Autowired
    private TapiqueryconfigMapper tapiqueryconfigMapper;
    @Autowired
    private TbmsapimanagerMapper tbmsapimanagerMapper;
    @Autowired
    private TinterfaceMapper tinterfaceMapper;
    @Autowired
    private CropMapper cropMapper;

    /**
     * tblockcolumns --- TINSTINTERINPUTCONFIG
     * C_NAME
     */

    @RequestMapping("/test1")
    public String test1(String test) {
        if (test != null) {
//            return "not do";
        }
        HashMap<String, String> map = new HashMap();
        //0 新增,1 修改,2 删除
        map.put("2017050501", "PE0004,1");//产品修改
        map.put("2016062401", "PE0004,0");//产品创设
        map.put("2016062402", "PE0004,0");//产品创设

        map.put("10022", "queryPE0005,0");//受益级别新增
        map.put("2016072601", "PS0006,0");//产品销售商新增
        map.put("2017051901", "PS0006,0");//产品销售商新增

        map.put("2016071101", "PE0007,0");//交易限制新增
        map.put("2016071102", "PE0007,0");//交易限制新增
        map.put("2016071103", "PE0007,0");//交易限制新增

        map.put("2017012301", "PE0003,0");//项目银行账户新增
        map.put("2017012302", "PE0003,0");//项目银行账户新增
        map.put("2017012303", "PE0003,0");//项目银行账户新增
        map.put("2017012304", "PE0003,0");//项目银行账户新增
        map.put("2017012305", "PE0003,0");//项目银行账户新增

        map.put("52201608170001", "PE0013,1");//净值维护
        map.put("52201608170002", "PE0013,1");//净值维护
        map.put("52201608170003", "PE0013,1");//净值维护

        map.put("2017022648", "PE0015,1");//渠道信息维护-PE0015

        map.put("2016051001", "AE0001,0");//开户 客户基本资料
        map.put("201605100101", "AE0001,0");//开户 客户基本资料
        map.put("2018031202", "AE0001,0");//开户 反洗钱_客户基本资料子block配置
        map.put("2019011300102", "AE0001,0");//开户 235号文_客户基本资料子block配置
//        map.put("202018032001", "AE0001,0");//开户 客户干系人信息
        map.put("202018091101", "AE0001,0");//开户 受益人信息
        map.put("202018091102", "AE0001,0");//开户 股东信息
        map.put("2017021501", "AE0001,0");//开户 客户承受风险等级
        map.put("202018092501", "AE0001,0");//开户 客户人工标识
        map.put("2022092001", "AE0001,0");//开户 合格投资者认证信息
        map.put("2019011400101", "AE0001,0");//开户 销售适当性_客户基本资料子block配置
        map.put("20190113001002", "AE0001,0");//开户 新监管报送_客户基本资料子block配置
        map.put("8206", "AE0001,0");//开户 附件信息

        map.put("3005009", "TE0004,0");//资金到账 新增
        map.put("3005010", "TE0004,0");//资金到账 新增
        map.put("3005011", "TE0004,0");//资金到账 新增

        String[] ids = test.split(",");
//        id = "2017050501";
        if (map.get(test).contains("query")) {
            map.put(test, map.get(test).replace("query", ""));//受益级别新增
            query(map, ids);
        } else {
            block(map, ids);
        }
        return "success";
    }

    public void query(HashMap<String, String> map, String[] ids) {
        for (String id : ids) {
            TquerycolumnExample example = new TquerycolumnExample();
            TquerycolumnExample.Criteria criteria = example.createCriteria();
            criteria.andLPagesnoEqualTo(new BigDecimal(id)).andCEnbelEqualTo("1");

            List<Tquerycolumn> rs = tquerycolumnMapper.selectByExample(example);
            Tquerycolumn rr = rs.get(0);
            TinterfaceExample tinterfaceExample = new TinterfaceExample();
            TinterfaceExample.Criteria criteria2 = tinterfaceExample.createCriteria();
            criteria2.andCodeEqualTo(map.get(rr.getlPagesno()).substring(0, 6));
            List<Tinterface> tinterfaces = tinterfaceMapper.selectByExample(tinterfaceExample);

            TinstinterinputconfigExample ex = new TinstinterinputconfigExample();
            TinstinterinputconfigExample.Criteria criteria1 = ex.createCriteria();
            criteria1.andCFunctionidEqualTo(map.get(rr.getlPagesno()).substring(0, 6))
                    .andCSystemEqualTo("CA");
            if (CollectionUtils.isEmpty(tinterfaces)){
                criteria1.andCInterfaceidEqualTo("1000000000000000099");
            }else{
                criteria1.andCInterfaceidEqualTo(tinterfaces.get(0).getId());
            }
            tinstinterinputconfigMapper.deleteByExample(ex);
            for (Tquerycolumn r : rs) {
                if (!"1".equals(r.getcEnbel())) {
                    continue;
                }
                Tinstinterinputconfig conf = new Tinstinterinputconfig();
                conf.setcSystem("CA");//TODO
                conf.setcFunctionid(map.get(rr.getlPagesno().toString()).substring(0, 6));//functionid

                if (CollectionUtils.isEmpty(tinterfaces)){
                    conf.setcInterfaceid("1000000000000000099");//faceid
                }else{
                    conf.setcInterfaceid(tinterfaces.get(0).getId());//faceid
                }
                conf.setcFieldcode(r.getcName());//字段名
                conf.setcType("S");
                if ("4".equals(r.getcDatatype())) {
                    conf.setcType("D");
                }
                conf.setcIsmust("0");
                if (!StringUtils.isEmpty(r.getcCheck())) {
                    String[] checks = r.getcCheck().split(";");
                    if (checks != null && checks.length > 0) {
                        for (String check : checks) {
                            checkToFormate(check, conf);
                        }
                    }
                }
                conf.setcRelatcolumn("");
                conf.setcDictname(r.getcDictname());
                conf.setcFieldname(r.getcLabel());
                if (r.getcCompparam() != null && r.getcCompparam().contains("maxlength")) {
                    String s = r.getcCompparam();
                    int start = s.indexOf("\"", s.lastIndexOf("maxlength") + 10);
                    int end = s.indexOf("\"", s.indexOf("\"", s.lastIndexOf("maxlength") + 10) + 1);
                    conf.setcLength(s.substring(start + 1, end));
                }
                tinstinterinputconfigMapper.insert(conf);
            }
        }
    }


    public void block(HashMap<String, String> map, String[] ids) {
        for (String id : ids) {
            TblockcolumnsExample example = new TblockcolumnsExample();
            TblockcolumnsExample.Criteria criteria = example.createCriteria();
            criteria.andCBlockidEqualTo(id).andCInvisibleEqualTo("1");

            List<Tblockcolumns> rs = tblockcolumnsMapper.selectByExample(example);
            Tblockcolumns rr = rs.get(0);

            TinterfaceExample tinterfaceExample = new TinterfaceExample();
            TinterfaceExample.Criteria criteria2 = tinterfaceExample.createCriteria();
            criteria2.andCodeEqualTo(map.get(rr.getcBlockid()).substring(0, 6));
            List<Tinterface> tinterfaces = tinterfaceMapper.selectByExample(tinterfaceExample);

            TinstinterinputconfigExample ex = new TinstinterinputconfigExample();
            TinstinterinputconfigExample.Criteria criteria1 = ex.createCriteria();
            criteria1.andCFunctionidEqualTo(map.get(rr.getcBlockid()).substring(0, 6))
                    .andCSystemEqualTo("CA");
            if (CollectionUtils.isEmpty(tinterfaces)){
                criteria1.andCInterfaceidEqualTo("1000000000000000099");
            }else{
                criteria1.andCInterfaceidEqualTo(tinterfaces.get(0).getId());
            }
            tinstinterinputconfigMapper.deleteByExample(ex);
            for (Tblockcolumns r : rs) {
                if (!"1".equals(r.getcInvisible())) {
                    continue;
                }
                Tinstinterinputconfig conf = new Tinstinterinputconfig();
                conf.setcSystem("CA");//TODO

                if (CollectionUtils.isEmpty(tinterfaces)){
                    conf.setcInterfaceid("1000000000000000099");//faceid
                }else{
                    conf.setcInterfaceid(tinterfaces.get(0).getId());//faceid
                }
                conf.setcFunctionid(map.get(rr.getcBlockid()).substring(0, 6));//functionid
                conf.setcFieldcode(r.getcName());//字段名
                conf.setcType("S");
                conf.setcIsmust("0");
                if (!StringUtils.isEmpty(r.getcCheck())) {
                    String[] checks = r.getcCheck().split(";");
                    if (checks != null && checks.length > 0) {
                        for (String check : checks) {
                            checkToFormate(check, conf);
                        }
                    }
                }
                conf.setcRelatcolumn("");
                conf.setcDictname(r.getcDictname());
                conf.setcFieldname(r.getcLabel());
                if (r.getlMaxlength() != null) {
                    conf.setcLength(r.getlMaxlength().toString());
                }
                tinstinterinputconfigMapper.insert(conf);
            }
        }
    }

    public void checkToFormate(String check, Tinstinterinputconfig conf) {
        if (check.equalsIgnoreCase("required")) {
            conf.setcIsmust("1");
        }
        if (check.equalsIgnoreCase("date")) {
            conf.setcType("D");
        }
        if (check.equalsIgnoreCase("email")) {
            conf.setcFormat("^(\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+){0,1}$");
        }
        if (check.equalsIgnoreCase("intege")) {
            conf.setcFormat("^-?[1-9]\\d*$|^0$");
        }
        if (check.equalsIgnoreCase("intege1")) {
            conf.setcFormat("^[1-9]\\d*$");
        }
        if (check.equalsIgnoreCase("intege2")) {
            conf.setcFormat("^-[1-9]\\d*$");
        }
        //mun
        if (check.equalsIgnoreCase("num")) {
            conf.setcFormat("^\\d+$");
        }
        if (check.equalsIgnoreCase("num1")) {
            conf.setcFormat("^[1-9]\\d*$|^0$");
        }
        if (check.equalsIgnoreCase("num2")) {
            conf.setcFormat("^-[1-9]\\d*$|^0$");
        }
        //decmal
        if (check.equalsIgnoreCase("decmal")) {
            conf.setcFormat("^(-?\\d+)(\\.\\d+)?$");
        }
        if (check.equalsIgnoreCase("decmal1")) {
            conf.setcFormat("^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$");
        }
        if (check.equalsIgnoreCase("decmal2")) {
            conf.setcFormat("^-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*)$");
        }
        if (check.equalsIgnoreCase("decmal3")) {
            conf.setcFormat("^-?([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|0?.0+|0)$");
        }
        if (check.equalsIgnoreCase("decmal4")) {
            conf.setcFormat("^\\d+(\\.\\d+)?$");
        }
        if (check.equalsIgnoreCase("decmal5")) {
            conf.setcFormat("^(-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*))|0?.0+|0$");
        }

        if (check.equalsIgnoreCase("letter")) {
            conf.setcFormat("^[A-Za-z]+$");
        }
        if (check.equalsIgnoreCase("tel")) {
            conf.setcFormat("^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$");
        }
        if (check.equalsIgnoreCase("mobile")) {
            conf.setcFormat("^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$");
        }
        if (check.equalsIgnoreCase("chinese")) {
            conf.setcFormat("^[\\u4E00-\\u9FA5\\uF900-\\uFA2D]+$");
        }
        if (check.equalsIgnoreCase("date")) {
            conf.setcFormat("^\\d{4}\\d{1,2}\\d{1,2}$");
        }
        if (check.equalsIgnoreCase("qq")) {
            conf.setcFormat("[1-9][0-9]{4,11}");
        }
        if (check.equalsIgnoreCase("picture")) {
            conf.setcFormat("(.*)\\.(jpg|bmp|gif|ico|pcx|jpeg|tif|png|raw|tga)$");
        }
    }


    @RequestMapping("/test2")
    public String test2(String test) {
        HashMap<String, String> map = new HashMap();
        //0 新增,1 修改,2 删除
        map.put("2017050501", "PE0004,1");//产品修改
        map.put("2016062401", "PE0004,0");//产品创设
        map.put("2016062402", "PE0004,0");//产品创设

        map.put("10022", "queryPE0005,0");//受益级别新增
        map.put("10022", "queryPE0005,1");//受益级别新增
        map.put("30012", "queryPE0006,0");//产品销售商新增
        map.put("30012", "queryPE0006,1");//产品销售商新增

        map.put("2016071101", "PE0007,0");//交易限制新增
        map.put("2016071102", "PE0007,0");//交易限制新增
        map.put("2016071103", "PE0007,0");//交易限制新增
        map.put("2016071101", "PE0007,1");//交易限制新增
        map.put("2016071102", "PE0007,1");//交易限制新增
        map.put("2016071103", "PE0007,1");//交易限制新增

        map.put("2017012301", "PE0003,0");//项目银行账户新增
        map.put("2017012302", "PE0003,0");//项目银行账户新增
        map.put("2017012303", "PE0003,0");//项目银行账户新增
        map.put("2017012304", "PE0003,0");//项目银行账户新增
        map.put("2017012305", "PE0003,0");//项目银行账户新增
        map.put("2017012301", "PE0003,1");//项目银行账户新增
        map.put("2017012302", "PE0003,1");//项目银行账户新增
        map.put("2017012303", "PE0003,1");//项目银行账户新增
        map.put("2017012304", "PE0003,1");//项目银行账户新增
        map.put("2017012305", "PE0003,1");//项目银行账户新增

        map.put("52201608170001", "PE0013,1");//净值维护
        map.put("52201608170002", "PE0013,1");//净值维护
        map.put("52201608170003", "PE0013,1");//净值维护

        map.put("2017022648", "PE0015,1");//渠道信息维护-PE0015

        map.put("2016051001", "AE0001,0");//开户 客户基本资料
        map.put("201605100101", "AE0001,0");//开户 客户基本资料
        map.put("2018031202", "AE0001,0");//开户 反洗钱_客户基本资料子block配置
        map.put("2019011300102", "AE0001,0");//开户 235号文_客户基本资料子block配置
//        map.put("202018032001", "AE0001,0");//开户 客户干系人信息
        map.put("202018091101", "AE0001,0");//开户 受益人信息
        map.put("202018091102", "AE0001,0");//开户 股东信息
        map.put("2017021501", "AE0001,0");//开户 客户承受风险等级
        map.put("202018092501", "AE0001,0");//开户 客户人工标识
        map.put("2022092001", "AE0001,0");//开户 合格投资者认证信息
        map.put("2019011400101", "AE0001,0");//开户 销售适当性_客户基本资料子block配置
        map.put("20190113001002", "AE0001,0");//开户 新监管报送_客户基本资料子block配置
        map.put("8206", "AE0001,0");//开户 附件信息

        map.put("2016051001", "AE0001,1");//开户 客户基本资料
        map.put("201605100101", "AE0001,1");//开户 客户基本资料
        map.put("2018031202", "AE0001,1");//开户 反洗钱_客户基本资料子block配置
        map.put("2019011300102", "AE0001,1");//开户 235号文_客户基本资料子block配置
//        map.put("202018032001", "AE0001,1");//开户 客户干系人信息
        map.put("202018091101", "AE0001,1");//开户 受益人信息
        map.put("202018091102", "AE0001,1");//开户 股东信息
        map.put("2017021501", "AE0001,1");//开户 客户承受风险等级
        map.put("202018092501", "AE0001,1");//开户 客户人工标识
        map.put("2022092001", "AE0001,1");//开户 合格投资者认证信息
        map.put("2019011400101", "AE0001,1");//开户 销售适当性_客户基本资料子block配置
        map.put("20190113001002", "AE0001,1");//开户 新监管报送_客户基本资料子block配置
        map.put("8206", "AE0001,1");//开户 附件信息

        map.put("3005009", "TE0004,0");//资金到账 新增
        map.put("3005010", "TE0004,0");//资金到账 新增
        map.put("3005011", "TE0004,0");//资金到账 新增
        map.put("3005009", "TE0004,1");//资金到账 新增
        map.put("3005010", "TE0004,1");//资金到账 新增
        map.put("3005011", "TE0004,1");//资金到账 新增
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> e : entries) {
            TinstinterinputconfigExample example = new TinstinterinputconfigExample();
            TinstinterinputconfigExample.Criteria criteria = example.createCriteria();
            String value = e.getValue();
            if (value.contains("query")) {
                value = value.replace("query", "");
                criteria.andCFunctionidEqualTo(value.substring(0, 6)).andCSystemEqualTo("CA").andCInterfaceidEqualTo(value.substring(7, 8))
                        .andCFieldcodeIsNotNull().andCFieldnameIsNull();
                List<Tinstinterinputconfig> confs = tinstinterinputconfigMapper.selectByExample(example);
                for (Tinstinterinputconfig conf : confs) {
                    if (StringUtils.isEmpty(conf.getcFieldcode())) {
                        continue;
                    }
                    TquerycolumnExample examplequery = new TquerycolumnExample();
                    TquerycolumnExample.Criteria criteriaquery = examplequery.createCriteria();
                    criteriaquery.andLPagesnoEqualTo(new BigDecimal(e.getKey())).andCNameEqualTo(conf.getcFieldcode());
                    List<Tquerycolumn> rs = tquerycolumnMapper.selectByExample(examplequery);
                    if (!CollectionUtils.isEmpty(rs)) {
                        if (StringUtils.isEmpty(rs.get(0).getcLabel())) {
                            continue;
                        }
                        Tinstinterinputconfig confupdate = new Tinstinterinputconfig();
                        confupdate.setcFieldname(rs.get(0).getcLabel());
                        TinstinterinputconfigExample example1 = new TinstinterinputconfigExample();
                        TinstinterinputconfigExample.Criteria criteria1 = example1.createCriteria();
                        criteria1.andCFunctionidEqualTo(value.substring(0, 6)).andCSystemEqualTo("CA").
                                andCInterfaceidEqualTo(value.substring(7, 8)).andCFieldcodeEqualTo(conf.getcFieldcode());
                        tinstinterinputconfigMapper.updateByExampleSelective(confupdate, example1);
                    }
                }
            } else {
                value = value.replace("query", "");
                criteria.andCFunctionidEqualTo(value.substring(0, 6)).andCSystemEqualTo("CA").andCInterfaceidEqualTo(value.substring(7, 8))
                        .andCFieldcodeIsNotNull().andCFieldnameIsNull();
                List<Tinstinterinputconfig> confs = tinstinterinputconfigMapper.selectByExample(example);
                for (Tinstinterinputconfig conf : confs) {
                    if (StringUtils.isEmpty(conf.getcFieldcode())) {
                        continue;
                    }
                    TblockcolumnsExample exampleblock = new TblockcolumnsExample();
                    TblockcolumnsExample.Criteria criteriablock = exampleblock.createCriteria();
                    criteriablock.andCBlockidEqualTo(e.getKey()).andCNameEqualTo(conf.getcFieldcode());
                    List<Tblockcolumns> rs = tblockcolumnsMapper.selectByExample(exampleblock);
                    if (!CollectionUtils.isEmpty(rs)) {
                        if (StringUtils.isEmpty(rs.get(0).getcLabel())) {
                            continue;
                        }
                        Tinstinterinputconfig confupdate = new Tinstinterinputconfig();
                        confupdate.setcFieldname(rs.get(0).getcLabel());
                        TinstinterinputconfigExample example1 = new TinstinterinputconfigExample();
                        TinstinterinputconfigExample.Criteria criteria1 = example1.createCriteria();
                        criteria1.andCFunctionidEqualTo(value.substring(0, 6)).andCSystemEqualTo("CA").
                                andCInterfaceidEqualTo(value.substring(7, 8)).andCFieldcodeEqualTo(conf.getcFieldcode());
                        tinstinterinputconfigMapper.updateByExampleSelective(confupdate, example1);
                    }
                }
            }
        }
        return "success";
    }

    @RequestMapping("/test3")
    public String test3(String test) {
        TbmsapimanagerExample example = new TbmsapimanagerExample();
        List<Tbmsapimanager> tbmsapimanagers = tbmsapimanagerMapper.selectByExample(example);
        TinterfaceExample tinterfaceExample = new TinterfaceExample();
        tinterfaceMapper.deleteByExample(tinterfaceExample);
        Long id = 1000000000000000000L;
        for (Tbmsapimanager tbmsapimanager : tbmsapimanagers) {
            id++;
            Tinterface tinterface = new Tinterface();
            tinterface.setId(id.toString());
            System.out.println(id);
            if (tbmsapimanager.getcPath().contains("save")) {
                System.out.println(tbmsapimanager.getcFunctionid());
                tinterface.setCode(tbmsapimanager.getcFunctionid().replace("E", "S"));
                System.out.println(tinterface.getCode());
            } else if (tbmsapimanager.getcPath().contains("modify")) {
                System.out.println(tbmsapimanager.getcFunctionid());
                tinterface.setCode(tbmsapimanager.getcFunctionid().replace("E", "M"));
                System.out.println(tinterface.getCode());
            } else if (tbmsapimanager.getcPath().contains("delete")) {
                System.out.println(tbmsapimanager.getcFunctionid());
                tinterface.setCode(tbmsapimanager.getcFunctionid().replace("E", "D"));
                System.out.println(tinterface.getCode());
            } else {
                tinterface.setCode(tbmsapimanager.getcFunctionid());
                System.out.println(tinterface.getCode());
            }


            tinterface.setName(tbmsapimanager.getcName());
            tinterface.setPath(tbmsapimanager.getcPath());
            tinterface.setEnabled(tbmsapimanager.getcStatus());
            tinterface.setInterfaceVersion("1");
            tinterface.setMethod("1");
            if (tbmsapimanager.getcFunctionid().substring(0, 1).equals("A")) {
                tinterface.setBelong("0");
            } else if (tbmsapimanager.getcFunctionid().substring(0, 1).equals("P")) {
                tinterface.setBelong("1");
            } else if (tbmsapimanager.getcFunctionid().substring(0, 1).equals("T")) {
                tinterface.setBelong("2");
            }
            tinterface.setRemark(tbmsapimanager.getcRemark());
            tinterface.setCreateTime(new Date());
            tinterface.setUpdateTime(new Date());
            tinterface.setVersion(new BigDecimal("1"));
            tinterfaceMapper.insert(tinterface);
        }
        return "success";
    }


    @RequestMapping("/test4")
    public String test4(String test) {
        TbapiqueryconfigExample example = new TbapiqueryconfigExample();
        example.setOrderByClause(" C_FUNCTIONID ");
        List<Tbapiqueryconfig> tbapiqueryconfigs = tbapiqueryconfigMapper.selectByExampleWithBLOBs(example);

        //delete


        tapiqueryconfigMapper.deleteByExample(new TapiqueryconfigExample());
        TinterfaceExample tinterfaceExample = new TinterfaceExample();
        TinterfaceExample.Criteria criteria = tinterfaceExample.createCriteria();
        criteria.andIdLike("11%");
        tinterfaceMapper.deleteByExample(tinterfaceExample);
        Long id = 1100000000000000000L;
        int a = 21;
        int p = 31;
        int t = 0;
        for (Tbapiqueryconfig old : tbapiqueryconfigs) {
            id++;
            a++;
            p++;
            t++;
            Tapiqueryconfig newt = new Tapiqueryconfig();
            newt.setId(id.toString());
            if (old.getcFunctionid().startsWith("A")) {
                newt.setInterfaceId("AQ00" + a);
            } else if (old.getcFunctionid().startsWith("P")) {
                newt.setInterfaceId("PQ00" + p);
            } else {
                if (t > 9) {
                    newt.setInterfaceId("TQ00" + t);
                } else {
                    newt.setInterfaceId("TQ000" + t);
                }
            }
            newt.setReload(old.getcReload());
            newt.setPagination(old.getcPagination());
            newt.setCreateTime(new Date());
            newt.setUpdateTime(new Date());
            newt.setVersion(new BigDecimal("1"));
            newt.setDsql(old.getcSql());
            tapiqueryconfigMapper.insert(newt);


            Tinterface tinterface = new Tinterface();
            tinterface.setId(id.toString());
            tinterface.setCode(newt.getInterfaceId());
            tinterface.setName(old.getcTitle());
            tinterface.setEnabled(old.getcEnable());
            tinterface.setInterfaceVersion("1");
            tinterface.setMethod("1");
            if (old.getcFunctionid().substring(0, 1).equals("A")) {
                tinterface.setBelong("0");
            } else if (old.getcFunctionid().substring(0, 1).equals("P")) {
                tinterface.setBelong("1");
            } else if (old.getcFunctionid().substring(0, 1).equals("T")) {
                tinterface.setBelong("2");
            }
            tinterface.setCreateTime(new Date());
            tinterface.setUpdateTime(new Date());
            tinterface.setVersion(new BigDecimal("1"));
            tinterfaceMapper.insert(tinterface);
        }
        return "success";
    }

    @RequestMapping("/numTest")
    public String numTest(String test) {
        cropMapper.numTest(test);
        return "";
    }
}
