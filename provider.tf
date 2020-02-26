provider "google" { 
  credentials = "${file("/var/lib/jenkins/sc.json")}"
  project     = "infosys-251803"
  region      = "us-central1"
}