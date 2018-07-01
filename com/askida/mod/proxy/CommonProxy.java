package com.askida.mod.proxy;

import com.askida.mod.util.EventHandler;
import com.askida.telegram.api.methods.TelegramAPI;
import com.askida.telegram.engine.EventsHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new EventHandler());

        TelegramAPI api = new TelegramAPI(new EventsHandler());

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(api);

    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
