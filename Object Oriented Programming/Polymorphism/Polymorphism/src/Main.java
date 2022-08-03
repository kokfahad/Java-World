public class Main {
    public static void main(String[] args) {
        Parent[] parents = {new Child1(),new Child2()};
        for (Parent parent: parents)
            parent.render();
    }
}
