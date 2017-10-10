class If extends Special {

    public If() {}

    void print(Node t, int n, boolean p) {
        if (!p) {
            System.out.print("(");
        }
        t.getCar().print(n, true);
        System.out.print(" ");
        t.getCdr().getCar().print(n, false);
        if (t.getCdr().getCdr().isPair()) {
            System.out.println();
            printSubtree(t.getCdr().getCdr(),n + 4);
        }
    }

    private void printSubtree(Node t, int n) {
        for(int i = 0; i < n; i++)
            System.out.print(" ");
        t.getCar().print(n);
        System.out.println();
        if(!t.getCdr().isNull()) {
            printSubtree(t.getCdr(), n);
        } else {
            t.getCdr().print(n - 4, true);
        }
    }

    void printQuote(Node t, int n, boolean p) {
        if(!p) {
            System.out.print(" ");
        }
        t.getCar().print(n, true);
        if (!t.getCdr().isNull()) {
            printSubtree(t.getCdr(), 0);
        }
    }
}