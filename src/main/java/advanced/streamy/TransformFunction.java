package advanced.streamy;

@FunctionalInterface
public interface TransformFunction {
    String transform(String text);
}
