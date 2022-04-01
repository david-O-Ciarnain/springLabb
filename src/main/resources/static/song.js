const handleDelete = id => fetch('/song/' + id, {method: 'DELETE' })
.then(res => window.location.href = res.url)