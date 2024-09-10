def call (String aws_account_ID, String region, String ecr_RepoName) {
  sh """
  aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_ID}.dkr.ecr.${region}.amazonaws.com
  docker push ${aws_account_ID}.dkr.ecr.${region}.amazonaws.com/${ecr_RepoName}:latest
  """
}
