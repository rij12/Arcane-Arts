import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    private static Node root;

    @BeforeClass
    public static void setup() {
        root = new Node(10);
        root.insert(5);
        root.insert(15);
        root.insert(8);
    }


    @Test
    public void contains() throws Exception {
        boolean cotanins_assert = root.contains(15);
        Assert.assertTrue(cotanins_assert);
    }
}