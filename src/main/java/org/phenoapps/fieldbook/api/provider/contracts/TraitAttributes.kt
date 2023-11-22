package org.phenoapps.fieldbook.api.provider.contracts

class TraitAttributes: QueryableContentProvider {

    companion object {
        const val URI = "content://fieldbook/trait_attributes"
        const val NAME = "observation_variable_attribute_name"
    }

    override val _ID = "internal_id_observation_variable_attribute"
    override val path = "trait_attributes"
    override val columns = arrayOf(_ID, NAME)
}