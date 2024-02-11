import androidx.compose.ui.window.ComposeUIViewController
import com.jaegerapps.sqldelightdemo.composeApp.database.SQLDelightDemoDatabase

fun MainViewController() = ComposeUIViewController {
    val database = SQLDelightDemoDatabase(DatabaseDriverFactory().createDriver())
    App(database)
}
