import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {
    @Test
    public void myMockTestTrue(){
        Student strmock = mock(Student.class);
        when(strmock.getSid()).thenReturn(1);
        when(strmock.getSname()).thenReturn("张漾");
        when(strmock.getSclass()).thenReturn("nuaa");
        StudentDaoImpl studentDao = new StudentDaoImpl();
        try {
            String s=studentDao.isFindStudent(strmock);
            assertEquals("true",s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void myMockTestFalse(){
        Student strmock = mock(Student.class);
        when(strmock.getSid()).thenReturn(5);
        when(strmock.getSname()).thenReturn("zy");
        when(strmock.getSclass()).thenReturn("nuaa");
        StudentDaoImpl studentDao = new StudentDaoImpl();
        try {
            String s=studentDao.isFindStudent(strmock);
            assertEquals("true",s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
