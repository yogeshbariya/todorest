resource "google_container_cluster" "gke-cluster" {
  name               = "my-first-gke-cluster1"
  network            = "default"
  location           = "us-central1-a"
  initial_node_count = 3
}