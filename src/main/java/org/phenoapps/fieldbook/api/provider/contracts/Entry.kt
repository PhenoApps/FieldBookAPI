package org.phenoapps.fieldbook.api.provider.contracts

class Entry {
    companion object: QueryableContentProvider {

        const val STUDY_ID = "study_id"
        const val BRAPI_ID = "observation_unit_db_id"
        const val PRIMARY_ID = "primary_id"
        const val SECONDARY_ID = "secondary_id"
        const val GEO_COORDINATES = "geo_coordinates"
        const val ADDITIONAL_INFO = "additional_info"
        const val GERMPLASM_DB_ID = "germplasm_db_id"
        const val GERMPLASM_NAME = "germplasm_name"
        const val OBSERVATION_LEVEL = "observation_level"
        const val POSITION_COORDINATE_X = "position_coordinate_x"
        const val POSITION_COORDINATE_Y = "position_coordinate_y"
        const val POSITION_COORDINATE_X_TYPE = "position_coordinate_x_type"
        const val POSITION_COORDINATE_Y_TYPE = "position_coordinate_y_type"

        override val path = "entries"

        override val _ID = "internal_id_observation_unit"

        override val columns = arrayOf(
            _ID, STUDY_ID, BRAPI_ID, PRIMARY_ID, SECONDARY_ID, GEO_COORDINATES, ADDITIONAL_INFO,
            GERMPLASM_DB_ID, GERMPLASM_NAME, OBSERVATION_LEVEL, POSITION_COORDINATE_X,
            POSITION_COORDINATE_Y, POSITION_COORDINATE_X_TYPE, POSITION_COORDINATE_Y_TYPE
        )
    }
}