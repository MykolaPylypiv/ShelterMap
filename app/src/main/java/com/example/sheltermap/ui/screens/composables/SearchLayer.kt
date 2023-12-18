package com.example.sheltermap.ui.screens.composables

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.sheltermap.ui.screens.map.MapViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchLayer(viewModel: MapViewModel) {
    var value by remember { mutableStateOf("") }
    var visibleLazy by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .background(if (visibleLazy) MaterialTheme.colorScheme.primary.copy(0.8f) else MaterialTheme.colorScheme.primary.copy(0.95f))
            .animateContentSize(tween())
    ) {
        val focusRequester = remember { FocusRequester() }
        val focusManager = LocalFocusManager.current

        OutlinedTextField(value = value,
            onValueChange = { onQueryChanged ->
                value = onQueryChanged
            },
            shape = RoundedCornerShape(50),
            maxLines = 1,
            textStyle = MaterialTheme.typography.bodyLarge,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color.LightGray,
                unfocusedIndicatorColor = Color.LightGray,
                disabledIndicatorColor = Color.LightGray
            ),
            placeholder = {
                Text(text = "Пошук",
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = if (!visibleLazy) Modifier.clickable { focusManager.clearFocus() } else Modifier)
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    tint = MaterialTheme.colorScheme.secondary,
                    contentDescription = "Search Icon"
                )
            },
            trailingIcon = {
                if (value != "") {
                    IconButton(onClick = {
                        value = ""
                    }) {
                        Icon(
                            imageVector = Icons.Rounded.Clear,
                            tint = MaterialTheme.colorScheme.secondary,
                            contentDescription = "Clear Icon"
                        )
                    }
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .focusRequester(focusRequester)
                .onFocusChanged {
                    visibleLazy = !focusRequester.freeFocus()
                })

        LazyColumn(
            modifier = Modifier
                .height(if (visibleLazy) 0.dp else 600.dp)
                .fillMaxWidth()
        ) {

        }
    }
}