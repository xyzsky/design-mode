package combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */

/**
 * 组合节点
 */
public class Node extends AbstractNode{
    private List<AbstractNode> children;
    private int id;
    private int pid;
    public Node() {
        children = new ArrayList<AbstractNode>();
    }
    @Override
    public boolean isRoot() {
        return -1 == pid;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public int getParentId() {
        return pid;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void setParentId(int parentId) {
        this.pid = parentId;
    }
    public void add(AbstractNode c) {
        c.setParentId(this.pid+children.size());
        c.setId(c.getParentId()+1);
        children.add(c);
    }
    public void remove(AbstractNode c) {
        children.remove(c);
    }
    public AbstractNode getChild(int i) {
        return children.get(i);
    }
}
