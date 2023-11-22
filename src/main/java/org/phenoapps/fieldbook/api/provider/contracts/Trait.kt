package org.phenoapps.fieldbook.api.provider.contracts

class Trait: QueryableContentProvider {
    companion object {

        //TODO
        const val URI = "content://fieldbook/traits"

        const val NAME = "observation_variable_name"
        const val FORMAT = "observation_variable_field_book_format"
        const val DEFAULT_VALUE = "default_value"
        const val VISIBLE = "visible"
        const val POSITION = "position"
        const val EXTERNAL_DB_ID = "external_db_id"
        const val DATA_SOURCE = "trait_data_source"
        const val ADDITIONAL_INFO = "additional_info"
        const val COMMON_CROP_NAME = "common_crop_name"
        const val LANGUAGE = "language"
        const val DATA_TYPE = "data_type"
        const val BRAPI_ID = "observation_variable_db_id"
        const val ONTOLOGY_DB_ID = "ontology_db_id"
        const val ONTOLOGY_NAME = "ontology_name"
        const val DETAILS = "observation_variable_details"
    }

    override val _ID = "internal_id_observation_variable"
    override val path = "traits"
    override val columns = arrayOf(
        NAME, FORMAT, DEFAULT_VALUE, VISIBLE, POSITION, EXTERNAL_DB_ID,
        DATA_SOURCE, ADDITIONAL_INFO, COMMON_CROP_NAME, LANGUAGE, DATA_TYPE, BRAPI_ID, ONTOLOGY_DB_ID,
        ONTOLOGY_NAME, DETAILS, _ID)
}