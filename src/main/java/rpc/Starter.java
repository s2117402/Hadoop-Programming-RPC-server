package rpc;


import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.Server;

import java.io.IOException;

public class Starter {
    public static void main(String[] args) throws HadoopIllegalArgumentException,IOException {

        RPC.Builder builder=new RPC.Builder(new Configuration());

        builder.setBindAddress("0.0.0.0").setPort(10000)
                .setProtocol(LoginServiceInterface.class).setInstance(new LoginServiceInterfaceImpl());

        Server server = builder.build();

        server.start();
    }
}
