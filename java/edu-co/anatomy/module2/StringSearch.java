package module2;

public class StringSearch extends AbstractSearch {

    @Override
    public boolean search(Object[] obj_list, Object obj) {
        if (obj_list.length > 0 && obj_list[0] instanceof String && obj instanceof String) {
            for (Object object : obj_list) {
                if (object.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}