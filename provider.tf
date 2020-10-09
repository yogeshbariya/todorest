provider "google" {
  credentials = file("/var/lib/jenkins/sc.json")
  project     = "vocal-camera-264620"
  region      = "us-central1"
}