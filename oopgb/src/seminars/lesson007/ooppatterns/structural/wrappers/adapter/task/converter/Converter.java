package seminars.lesson007.ooppatterns.structural.wrappers.adapter.task.converter;

import java.util.List;

/**
 A contract for objects that can represent two lists({@link List})
 as a string of strings related by position
 */
public interface Converter {
    String convert(List<String> keys, List<String> values);
}
