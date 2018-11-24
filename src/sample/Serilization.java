package sample;

/**
 * Created by benshorten on 12/11/2018.
 */

        import java.io.Serializable;

        import static sample.Controller.*;

public class Serilization implements Serializable {
    private static final long serialVersionUID = -5742822984616863149L;

    public int a;
    public String c1seri=c1text,c2seri=c2text,c3seri=c3text,c4seri=c4text,c5seri=c5text,c6seri=c6text,c7seri=c7text,c8seri=c8text,c9seri=c9text;

    // Default constructor
    public Serilization(int a, String b)
    {
        this.a = a;
        this.c1seri = c1text;
        this.c2seri = c2text;
        this.c3seri = c3text;
        this.c4seri = c4text;
        this.c5seri = c5text;
        this.c6seri = c6text;
        this.c7seri = c7text;
        this.c8seri = c8text;
        this.c9seri = c9text;

    }
}

