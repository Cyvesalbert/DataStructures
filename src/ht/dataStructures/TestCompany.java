package ht.dataStructures;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Toute modification a ce fichier ne sera pas comptabilisée

public class TestCompany {
    public void test() {
        TestHelper.printHeader("Debut des tests de l'arbre de companies");
        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method m : methods) {
            if (!m.getName().equals("test")) {
                try {
                    m.invoke(this);
                }
                catch (InvocationTargetException e) {
                    TestHelper.printError(e.getTargetException().getCause().getMessage());
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private CompanyTree initTest() {
        CompanyTree tree = new CompanyTree(new CompanyNode(100));

        CompanyNode _60 = new CompanyNode(60);

        CompanyNode _40 = new CompanyNode(40);
        _40.buy(new CompanyNode(-10));
        _40.buy(new CompanyNode(10));

        _60.buy(_40);
        _60.buy(new CompanyNode(19));
        _60.buy(new CompanyNode(15));

        CompanyNode _20 = new CompanyNode(20);
        _20.buy(new CompanyNode(15));

        _60.buy(_20);

        tree.buy(_60);

        CompanyNode _5 = new CompanyNode(5);
        _5.buy(new CompanyNode(-1));

        CompanyNode _21 = new CompanyNode(21);
        _21.buy(_5);

        CompanyNode _30 = new CompanyNode(30);
        _30.buy(_21);

        tree.buy(_30);

        CompanyNode _90 = new CompanyNode(90);
        _90.buy(new CompanyNode(33));

        CompanyNode __50 = new CompanyNode(-50);
        __50.buy(new CompanyNode(10));
        __50.buy(new CompanyNode(-5));

        _90.buy(__50);

        tree.buy(_90);

        return tree;
    }

    private void testMoney() {
        CompanyTree tree = initTest();
        TestHelper.printTest(tree.getMoney() == 402);
    }

    private void testWorstChild() {
        CompanyTree tree = initTest();
        TestHelper.printTest(tree.getWorstChildMoney() == -45);
    }

    private void testPrint() {
        CompanyTree tree = initTest();
        String expected =
                "402\n" +
                " > 169\n" +
                " >  > 40\n" +
                " >  >  > 10\n" +
                " >  >  > -10\n" +
                " >  > 35\n" +
                " >  >  > 15\n" +
                " >  > 19\n" +
                " >  > 15\n" +
                " > 78\n" +
                " >  > 33\n" +
                " >  > -45\n" +
                " >  >  > 10\n" +
                " >  >  > -5\n" +
                " > 55\n" +
                " >  > 25\n" +
                " >  >  > 4\n" +
                " >  >  >  > -1\n";
        TestHelper.printTest(tree.getTreeInOrder().equals(expected));
    }
}
