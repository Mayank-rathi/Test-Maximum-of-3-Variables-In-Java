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
        Assert.assertEquals((Integer) 10, finder);
    }

    @Test
    public void findThirdMaximumNumber_IfCorrect_ShouldReturn_PassTest() {
        Integer finder = maximumnumber.MaximumumnumberFinder(10, 20, 50);
        Assert.assertEquals((Integer) 50, finder);
    }
}
