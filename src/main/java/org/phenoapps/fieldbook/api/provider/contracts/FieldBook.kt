package org.phenoapps.fieldbook.api.provider.contracts

sealed class FieldBook {
    companion object {
        //content provider authorities should be reverse domain name with .provider appended
        //https://developer.android.com/guide/topics/providers/content-provider-creating
        const val AUTHORITY = "com.fieldbook.tracker.provider"
        const val CONTENT_URI = "content://$AUTHORITY"
    }
}