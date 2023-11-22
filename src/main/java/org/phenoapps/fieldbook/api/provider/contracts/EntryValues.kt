package org.phenoapps.fieldbook.api.provider.contracts

class EntryValues: QueryableContentProvider {
    companion object {
        const val URI = "content://fieldbook/entry_attributes"
        const val ATTRIBUTE_NAME = "observation_unit_attribute_name"
        const val STUDY_ID = "study_id"
    }

    override val _ID = "internal_id_observation_unit_attribute"
    override val path = "entry_values"
    override val columns = arrayOf(_ID, ATTRIBUTE_NAME, STUDY_ID)
}