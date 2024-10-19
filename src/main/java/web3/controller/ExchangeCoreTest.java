package web3.controller;

import exchange.core2.core.ExchangeApi;
import exchange.core2.core.ExchangeCore;
import exchange.core2.core.IEventsHandler;
import exchange.core2.core.SimpleEventsProcessor;
import exchange.core2.core.common.OrderAction;
import exchange.core2.core.common.OrderType;
import exchange.core2.core.common.api.ApiPlaceOrder;
import exchange.core2.core.common.cmd.CommandResultCode;
import exchange.core2.core.common.config.ExchangeConfiguration;
import exchange.core2.core.processors.journaling.DummySerializationProcessor;
import exchange.core2.core.processors.journaling.ISerializationProcessor;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ExchangeCoreTest {


    public static void main(String[] args) {
        // simple async events handler
        SimpleEventsProcessor eventsProcessor = new SimpleEventsProcessor(new IEventsHandler() {
            @Override
            public void tradeEvent(TradeEvent tradeEvent) {
                System.out.println("Trade event: " + tradeEvent);
            }

            @Override
            public void reduceEvent(ReduceEvent reduceEvent) {
                System.out.println("Reduce event: " + reduceEvent);
            }

            @Override
            public void rejectEvent(RejectEvent rejectEvent) {
                System.out.println("Reject event: " + rejectEvent);
            }

            @Override
            public void commandResult(ApiCommandResult commandResult) {
                System.out.println("Command result: " + commandResult);
            }

            @Override
            public void orderBook(OrderBook orderBook) {
                System.out.println("OrderBook event: " + orderBook);
            }
        });

// default exchange configuration
        ExchangeConfiguration conf = ExchangeConfiguration.defaultBuilder().build();

// no serialization
        Supplier<ISerializationProcessor> serializationProcessorFactory = () -> DummySerializationProcessor.INSTANCE;

// build exchange core
        ExchangeCore exchangeCore = ExchangeCore.builder()
                .resultsConsumer(eventsProcessor)
//                .serializationProcessorFactory(serializationProcessorFactory)
                .exchangeConfiguration(conf)
                .build();

// start up disruptor threads
        exchangeCore.startup();

// get exchange API for publishing commands
        ExchangeApi api = exchangeCore.getApi();

//        api.submitCommandAsync(ApiPlaceOrder.builder()
//                .uid(1001L)                // 用户ID
//                .orderId(2001L)            // 订单ID
//                .price(100000L)            // 订单价格
//                .size(500L)                // 订单数量
//                .action(OrderAction.BID)   // 买入操作
//                .orderType(OrderType.GTC)  // 限价单类型
//                .symbol(1)                 // 交易对
//                .build()
//        )

    }

}
