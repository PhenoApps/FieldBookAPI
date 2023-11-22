package org.phenoapps.fieldbook.api.provider.contracts

class Observation: QueryableContentProvider {
    companion object {
        const val URI = "content://fieldbook/observations"

        const val ENTRY_ID = "observation_unit_id"
        const val STUDY_ID = "study_id"
        const val TRAIT_DB_ID = "observation_variable_db_id"
        const val TRAIT_NAME = "observation_variable_name"
        const val TRAIT_FORMAT = "observation_variable_field_book_format"
        const val VALUE = "value"
        const val TIMESTAMP = "observation_time_stamp"
        const val GEO_COORDINATES = "geoCoordinates"
        const val COLLECTOR = "collector"
        const val BRAPI_ID = "observation_db_id"
        const val LAST_SYNCED_TIME = "last_synced_time"
        const val ADDITIONAL_INFO = "additional_info"
        const val REP = "rep"
        const val NOTES = "notes"
    }

    override val _ID = "internal_id_observation"
    override val path: String = "observations"
    override val columns = arrayOf(
        _ID, ENTRY_ID, STUDY_ID, TRAIT_DB_ID,
        TRAIT_NAME, TRAIT_FORMAT, VALUE, TIMESTAMP, GEO_COORDINATES, COLLECTOR, BRAPI_ID,
        LAST_SYNCED_TIME, ADDITIONAL_INFO, REP, NOTES
    )
}