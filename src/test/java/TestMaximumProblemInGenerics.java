import com.maximumUsingGenerics.MaximumProblemInGenerics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumProblemInGenerics {
    @Test
    public void findFirstMaximumNumber_IfCorrect_Shouldreturn_PassTest() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics(50, 20, 30);
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals(50, maxNumberFinder);
    }

    @Test
    public void findSecondMaximumNumber_IfCorrect_ShouldReturn_PassTest() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics(10, 50, 30);
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals(50, maxNumberFinder);
    }

    @Test
    public void findThirdMaximumNumber_IfCorrect_ShouldReturn_PassTest() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics(10, 20, 30);
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals(30, maxNumberFinder);

    }

    @Test
    public void findFirstMaximumNumber_IfCorrect_Shouldreturn_PassTest_InFloat() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics(50.1f, 20.2f, 30.3f);
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals(50.1f, (Float) maxNumberFinder, 0.0f);
    }

    @Test
    public void findSecondMaximumNumber_IfCorrect_ShouldReturn_PassTest_InFloat() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics(10.1f, 50.2f, 30.3f);
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals(50.2f, (Float) maxNumberFinder, 0.0f);

    }

    @Test
    public void findThirdMaximumNumber_IfCorrect_ShouldReturn_PassTest_InFloat() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics(10.2f, 20.2f, 50.3f);
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals(50.3f, (Float) maxNumberFinder, 0.0f);
    }

    @Test
    public void findFirstMaximumNumber_IfCorrect_Shouldreturn_PassTest_InString() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics("Peach", "Apple", "Banana");
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals("Peach", maxNumberFinder);
    }

    @Test
    public void findSecondMaximumNumber_IfCorrect_ShouldReturn_PassTest_InString() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics("Apple", "Peach", "Banana");
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals("Peach", maxNumberFinder);

    }

    @Test
    public void findThirdMaximumNumber_IfCorrect_ShouldReturn_PassTest_InString() {
        MaximumProblemInGenerics maxFinder = new MaximumProblemInGenerics("Apple", "Banana", "Peach");
        Comparable maxNumberFinder = maxFinder.MaximumumnumberFinder();
        Assert.assertEquals("Peach", maxNumberFinder);
    }
}
