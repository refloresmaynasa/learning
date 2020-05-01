package module2;

public class IntegerSearch extends AbstractSearch {

    @Override
    public boolean search(Object[] obj_list, Object obj) {
        if (obj_list.length > 0 && obj_list[0] instanceof Integer && obj instanceof Integer) {
            for (Object object : obj_list) {
                if (object.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}