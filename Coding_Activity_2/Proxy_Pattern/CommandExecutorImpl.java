package Coding_Activity_2.Proxy_Pattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{
    
    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
