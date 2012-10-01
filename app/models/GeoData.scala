package models
import scala.reflect.BeanProperty

class GeoData(key: String) {  
    def apiKey() = key

    var latitude: String = _
    var longitude: String = _
}