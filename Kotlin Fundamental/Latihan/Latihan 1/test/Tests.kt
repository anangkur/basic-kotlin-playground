import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun `if 6, test should be return false`() {
        Assert.assertFalse("shop is close", shopIsOpen(6, 7, 17))
    }

    @Test
    fun `if 10, test should be return true`() {
        Assert.assertTrue("shop is open", shopIsOpen(10, 7, 17))
    }

    @Test
    fun `if 20, test should be return false`() {
        Assert.assertFalse("shop is close", shopIsOpen(20, 7, 17))
    }
}