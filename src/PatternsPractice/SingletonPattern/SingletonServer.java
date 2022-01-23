package PatternsPractice.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public enum SingletonServer {

//    public static SingletonServer instance = new SingletonServer();
//
//    public static SingletonServer getInstance() {
//        if (instance == null) {
//            synchronized (SingletonServer.class) {
//                if (instance == null) {
//                    instance = new SingletonServer();
//                }
//            }
//        }
//        return instance;
//    }
//    private SingletonServer() {
//    }


    INSTANCE,
    INSTANCE2,
    THIRDONE;

    private List<String> allTheServers = new ArrayList<String>();

    public boolean addServer(String currentServer) {
        if (!allTheServers.contains(currentServer)) {
            allTheServers.add(currentServer);
            return true;
        } else {
            return false;
        }
    }

    public List<String> getWholeList() {
        return this.allTheServers;
    }
}