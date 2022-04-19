package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xyz
 * @Date 2022/4/19
 */
public class RouterComposite {
    private List<Router> routers = new ArrayList<>();

    public RouterComposite() {
        routers.add(new MiRouter());
        routers.add(new TpLinkRouter());
    }

    public void startSendData(RouterVisitor visitor) {
        for (Router router : routers) {
            router.accept(visitor);
        }
    }
}
