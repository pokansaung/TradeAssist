package com.pmw.tradeassist.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmw.tradeassist.ui.theme.TradeAssistTheme

@Composable
fun AveragePriceScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
        TextRow(
            text = "Current Entry Price",
            value = "0",
            onValueChange = {},
            modifier = Modifier
        )
        //Spacer(modifier = Modifier.size(5.dp))
        TextRow(
            text = "Quantity",
            value = "0",
            onValueChange = {},
            modifier = Modifier
        )
        TextRow(
            text = "Leverage Percentage",
            value = "%",
            onValueChange = {},
            modifier = Modifier
        )
    }
}

@Composable
fun TextRow(
    text: String,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
    ){
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.weight(1f)
        )
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.weight(1f)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun AvgPricePreview(){
    TradeAssistTheme {
        AveragePriceScreen()
    }
}