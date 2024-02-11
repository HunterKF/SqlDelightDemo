import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.jaegerapps.sqldelightdemo.composeApp.database.SQLDelightDemoDatabase

actual class DatabaseDriverFactory(
    private val context: Context
) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            schema = SQLDelightDemoDatabase.Schema,
            context = context,
            name = "SQLDelightDemoDatabase.db"
        )
    }
}