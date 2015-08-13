
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class JRubyCapsule extends Capsule {

    public JRubyCapsule(Path jarFile) {
        super(jarFile);
    }

    public JRubyCapsule(Capsule pred) {
        super(pred);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected <T> T attribute(Map.Entry<String, T> attr) {
        //
        // YOUR CUSTOM LAUNCH CODE GOES HERE
        //
        if (ATTR_APP_CLASS == attr) {
            return (T) org.jruby.Main.class.getName();
        }
        if (ATTR_MIN_JAVA_VERSION == attr) {
            return (T) "8"; // whatever
        }

        return super.attribute(attr);
    }

    @Override
    protected List<String> buildArgs(List<String> args) {
        //
        // AND HERE
        //
        return super.buildArgs(args);
    }

    @Override
    protected ProcessBuilder prelaunch(List<String> jvmArgs, List<String> args) {
        final ProcessBuilder pb = super.prelaunch(jvmArgs, args);
        //
        // AND POSSIBLY HERE
        //
        return pb;
    }

}
