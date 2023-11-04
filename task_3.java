@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result=result;
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {

                {17,false},
                {18,true},
                {20,true},
                {21,true},

        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Привет, это сообщение появляется, когда пользователь не достиг совершенолетия",result, isAdult);
    }

}