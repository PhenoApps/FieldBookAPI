package org.phenoapps.fieldbook.api.provider.contracts

sealed interface QueryableContentProvider {

    val path: String

    val columns: Array<String>

    //content provider table internal id name
    val _ID: String
}