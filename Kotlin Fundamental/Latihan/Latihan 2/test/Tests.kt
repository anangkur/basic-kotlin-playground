import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun `test call multiple() should be return 25`() {
        Assert.assertEquals(25, multiple("5", "5"))
    }

    @Test
    fun `test call sum() should be return 10`() {
        Assert.assertEquals(10, sum(5, 5))
    }
}