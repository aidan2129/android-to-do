package todo.aidan.com.to_do.db;

/**
 * Created by Aidan on 15/04/2016.
 */
import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "todo.aidan.com.to_do";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}