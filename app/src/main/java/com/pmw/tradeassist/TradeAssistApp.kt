package com.pmw.tradeassist

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmw.tradeassist.ui.theme.TradeAssistTheme

@Composable
fun TradeAssistApp(
    modifier: Modifier = Modifier
){

}

@Preview(showBackground = true)
@Composable
fun AppPreview(){
    TradeAssistTheme {
        TradeAssistApp()
    }
}