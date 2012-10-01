package controllers

import play.api._
import play.api.mvc._
import models.GeoData

object Application extends Controller {
  
  var data = new GeoData("AIzaSyBIAvKGXJFrMNoc2BbmT32PxTNh0_kDVFw")

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def map(lat: String, lng: String) = Action {
    data.latitude = lat
    data.longitude = lng
    Ok(views.html.mindex(data, "Your new application is ready."))
  }
  
}