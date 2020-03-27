provider "google" {
  credentials = file("vocal-camera-264620-2257fe68d879.json")
  project     = "vocal-camera-264620"
  region      = "us-central1"
}