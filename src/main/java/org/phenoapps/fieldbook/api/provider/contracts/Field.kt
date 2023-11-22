package org.phenoapps.fieldbook.api.provider.contracts

/**
 * Field Backend API Version 1
 *
 * This defines constants that other applications can use to query data into their app
 * using the FieldBook content provider.
 *
 *
 * TODO: FROM DOCS _ID is usually used for the internal ID but the values is maintained by implementation
 */
sealed class Field {
    companion object: QueryableContentProvider {

        //Column Names
        const val NAME = "study_name"
        const val UNIQUE_ID_NAME = "study_unique_id_name"
        const val PRIMARY_ID_NAME = "study_primary_id_name"
        const val SECONDARY_ID_NAME = "study_secondary_id_name"
        const val SORT_NAME = "study_sort_name"
        const val DATE_IMPORT = "date_import"
        const val DATE_EDIT = "date_edit"
        const val DATE_EXPORT = "date_export"
        const val COUNT = "count"

        //BrAPI Columns
        //TODO check if this is a BrAPI ID
        const val BRAPI_ID = "study_db_id"
        const val ALIAS = "study_alias"
        const val EXPERIMENTAL_DESIGN = "experimental_design"
        const val COMMON_CROP_NAME = "common_crop_name"
        const val SOURCE = "study_source"
        const val ADDITIONAL_INFO = "additional_info"
        const val LOCATION_DB_ID = "location_db_id"
        const val LOCATION_NAME = "location_name"
        const val OBSERVATION_LEVELS = "observation_levels"
        const val SEASONS = "seasons"
        const val START_DATE = "start_date"
        const val CODE = "study_code"
        const val DESCRIPTION = "description"
        const val TYPE = "type"
        const val TRIAL_DB_ID = "trial_db_id"
        const val TRIAL_NAME = "trial_name"

        override val _ID = "internal_id_study"
        override val path: String = "fields"
        override val columns = arrayOf(
            _ID, NAME, UNIQUE_ID_NAME, PRIMARY_ID_NAME, SECONDARY_ID_NAME,
            SORT_NAME, DATE_IMPORT, DATE_EDIT, DATE_EXPORT, COUNT, BRAPI_ID, ALIAS, EXPERIMENTAL_DESIGN, COMMON_CROP_NAME, SOURCE,
            ADDITIONAL_INFO, LOCATION_DB_ID, LOCATION_NAME, OBSERVATION_LEVELS, SEASONS,
            START_DATE, CODE, DESCRIPTION, TYPE, TRIAL_DB_ID, TRIAL_NAME
        )
    }

    //Content Provider Attributes
    val CONTENT_URI = "${FieldBook.CONTENT_URI}/$path"
}