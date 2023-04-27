package com.example.tradelinemobile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tradelinemobile.ui.theme.TradelineMobileTheme

@Composable
fun CreateStore() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp, start = 24.dp, end = 24.dp)
            .background(MaterialTheme.colorScheme.background)
    ) {
        Text(
            text = "CREATE STORE",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = "Create your store",
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(32.dp))

        Column {
            Text(
                text = "Store Name",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(6.dp))
            val storeName = remember { mutableStateOf(TextFieldValue("Enter your store name")) }
            OutlinedTextField(
                value = storeName.value,
                onValueChange = { storeName.value = it },
                shape = MaterialTheme.shapes.large,
                textStyle = MaterialTheme.typography.labelSmall,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = colorResource(id = R.color.blue100),
                    focusedTextColor = colorResource(id = R.color.blue100),
                    focusedBorderColor = colorResource(id = R.color.blue100),
                    unfocusedBorderColor = colorResource(id = R.color.blue100)
                ),
                modifier = Modifier
                    .height(50.dp)
                    .width(327.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            Text(
                text = "Email Address",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(6.dp))
            val emailAddress =
                remember { mutableStateOf(TextFieldValue("Enter your email address")) }
            OutlinedTextField(
                value = emailAddress.value,
                onValueChange = { emailAddress.value = it },
                shape = MaterialTheme.shapes.large,
                textStyle = MaterialTheme.typography.labelSmall,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = colorResource(id = R.color.blue100),
                    focusedTextColor = colorResource(id = R.color.blue100),
                    focusedBorderColor = colorResource(id = R.color.blue100),
                    unfocusedBorderColor = colorResource(id = R.color.blue100)
                ),
                modifier = Modifier
                    .height(50.dp)
                    .width(327.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            Text(
                text = "Phone Number",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(6.dp))
            val phoneNumber = remember { mutableStateOf(TextFieldValue("Enter your phone number")) }
            OutlinedTextField(
                value = phoneNumber.value,
                onValueChange = { phoneNumber.value = it },
                shape = MaterialTheme.shapes.large,
                textStyle = MaterialTheme.typography.labelSmall,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = colorResource(id = R.color.blue100),
                    focusedTextColor = colorResource(id = R.color.blue100),
                    focusedBorderColor = colorResource(id = R.color.blue100),
                    unfocusedBorderColor = colorResource(id = R.color.blue100)
                ),
                modifier = Modifier
                    .height(50.dp)
                    .width(327.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            Text(
                text = "Password",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(6.dp))
            val password = remember { mutableStateOf(TextFieldValue("*****************")) }
            var showPassword by remember { mutableStateOf(false) }

            OutlinedTextField(
                value = password.value,
                onValueChange = { password.value = it },
                shape = MaterialTheme.shapes.large,

                visualTransformation = if (showPassword) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                textStyle = MaterialTheme.typography.labelSmall,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = colorResource(id = R.color.blue100),
                    focusedTextColor = colorResource(id = R.color.blue100),
                    focusedBorderColor = colorResource(id = R.color.blue100),
                    unfocusedBorderColor = colorResource(id = R.color.blue100)
                ),

                trailingIcon = {
                    if (showPassword) {
                        IconButton(onClick = { showPassword = false }) {
                            Icon(
                                imageVector = Icons.Filled.Visibility,
                                contentDescription = "hide_password"
                            )
                        }
                    } else {
                        IconButton(
                            onClick = { showPassword = true }) {
                            Icon(
                                imageVector = Icons.Filled.VisibilityOff,
                                contentDescription = "hide_password"
                            )
                        }
                    }
                },

                modifier = Modifier
                    .height(50.dp)
                    .width(327.dp)
            )
        }

        Spacer(modifier = Modifier.height(36.dp))

        Column {
            Button(
                onClick = { /* ... */ }, shape = MaterialTheme.shapes.large,
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.blue100)
                ),
                modifier = Modifier
                    .height(50.dp)
                    .width(327.dp)
            )
            {
                Text(
                    text = "SUBMIT",
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center
            )
            {
                Text(
                    text = "Already have an account?",
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = " SIGN IN",
                    color = MaterialTheme.colorScheme.primary,
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CreateStorePreview() {
    TradelineMobileTheme { CreateStore() }
}