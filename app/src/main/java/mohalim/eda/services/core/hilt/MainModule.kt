package mohalim.eda.services.core.hilt

import android.content.Context
import android.webkit.WebView
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Singleton
    @Provides
    fun provideWebView(@ApplicationContext context: Context) : WebView{
        val webview : WebView = WebView(context)
        webview.settings.javaScriptEnabled = true
        return webview
    }
}