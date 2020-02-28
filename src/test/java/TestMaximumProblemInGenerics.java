import com.maximumUsingGenerics.MaximumProblemInGenerics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumProblemInGenerics {
    MaximumProblemInGenerics maximumnumber;

    @Before
    public void setUp() throws Exception {
        maximumnumber = new MaximumProblemInGenerics();
    }

    @Test
    public void findFirstMaximumNumber_IfCorrect_Shouldreturn_PassTest() {
        Integer finder = maximumnumber.MaximumumnumberFinder(50, 20, 30);
        Assert.assertEquals((Integer) 50, finder);
    }

    @Test
    public void findSecondMaximumNumber_IfCorrect_ShouldReturn_PassTest() {
        Integer finder = maximumnumber.MaximumumnumberFinder(10, 50, 30);
        Assert.assertEquals((Integer) 50, finder);
    }

    @Test
    public void findThirdMaximumNumber_IfCorrect_ShouldReturn_PassTest() {
        Integer finder = maximumnumber.MaximumumnumberFinder(10, 20, 30);
        Assert.assertEquals((Integer) 30, finder);
    }

    @Test
    public void findFirstMaximumNumber_IfCorrect_Shouldreturn_PassTest_InFloat() {
        Float finder = maximumnumber.MaximumumnumberFinder(50.1f, 20.2f, 30.3f);
        Assert.assertEquals((Float) 50.1f, finder, 0.0f);
    }

    @Test
    public void findSecondMaximumNumber_IfCorrect_ShouldReturn_PassTest_InFloat() {
        Float finder = maximumnumber.MaximumumnumberFinder(10.1f, 50.2f, 30.3f);
        Assert.assertEquals((Float) 50.2f, finder, 0.0f);

    }

    @Test
    public void findThirdMaximumNumber_IfCorrect_ShouldReturn_PassTest_InFloat() {
        Float finder = maximumnumber.MaximumumnumberFinder(10.2f, 20.2f, 50.3f);
        Assert.assertEquals((Float) 50.3f, finder, 0.0f);
    }

    @Test
    public void findFirstMaximumNumber_IfCorrect_Shouldreturn_PassTest_InString() {
        String finder = maximumnumber.MaximumumnumberFinder("Peach", "Apple", "Banana");
        Assert.assertEquals((String) "Peach", finder);
    }

    @Test
    public void findSecondMaximumNumber_IfCorrect_ShouldReturn_PassTest_InString() {
        String finder = maximumnumber.MaximumumnumberFinder("Apple", "Peach", "Banana");
        Assert.assertEquals((String) "Peach", finder);

    }

    @Test
    public void findThirdMaximumNumber_IfCorrect_ShouldReturn_PassTest_InString() {
        String finder = maximumnumber.MaximumumnumberFinder("Apple", "Banana", "Peach");
        Assert.assertEquals((String) "Peach", finder);
    }
}
