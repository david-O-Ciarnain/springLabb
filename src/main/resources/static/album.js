const handleDelete = id => fetch('/album' + id, {method: 'DELETE' })
.then(res => window.location.href = res.url)