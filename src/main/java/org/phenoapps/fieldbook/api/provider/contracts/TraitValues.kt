package org.phenoapps.fieldbook.api.provider.contracts

class TraitValues: QueryableContentProvider {

    companion object {
        const val URI = "content://fieldbook/trait_values"
        const val ATTRIBUTE_ID = "observation_variable_attribute_db_id"
        const val ATTRIBUTE_VALUE = "observation_variable_attribute_value"
        const val BRAPI_ID = "observation_variable_db_id"
    }

    override val _ID = "internal_id_observation_variable_value"
    override val path = "trait_values"
    override val columns = arrayOf(_ID, ATTRIBUTE_ID, ATTRIBUTE_VALUE, BRAPI_ID)
}