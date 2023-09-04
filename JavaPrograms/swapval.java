class sawpval{
    void display(String name)
    {
        System.out.println("This is method:"+ name);
    }
    public static void main(String[] args) {
        sawpval n = new sawpval();
        String name = " new";
        n.display(name);
    }
}