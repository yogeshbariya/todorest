provider "google" {
  credentials = file("sc.json")
  project     = "vocal-camera-264620"
  region      = "us-central1"
}