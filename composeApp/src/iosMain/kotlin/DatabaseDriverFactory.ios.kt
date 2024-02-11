import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.jaegerapps.sqldelightdemo.composeApp.database.SQLDelightDemoDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            schema = SQLDelightDemoDatabase.Schema,
            name = "SQLDelightDemoDatabase.db"
        )
    }
}