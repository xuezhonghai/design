package zhonghai.xue.design.behavior.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
